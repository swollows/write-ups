document.addEventListener('DOMContentLoaded', () => {
    // Use native WebSocket
    let ws;
    let checkedBoxes = new Set();
    const TOTAL_CHECKBOXES = 2_000_000;
    const CHECKBOXES_PER_PAGE = 1000; // Smaller chunks for smoother loading
    let currentPage = 0;
    let isLoading = false;
    let hasMoreCheckboxes = true;
    
    const checkboxGrid = document.getElementById('checkbox-grid');
    const checkedCount = document.getElementById('checked-count');
    const flagContainer = document.getElementById('flag-container');
    const flagElement = document.getElementById('flag');
    const loadingOverlay = document.querySelector('.loading-overlay');
    const content = document.querySelector('.content');
    
    // Server-side state
    const SERVER_FLAG = window.SERVER_FLAG;
    const ALL_CHECKED = window.ALL_CHECKED;
    
    // If server says all checkboxes are checked, show flag immediately
    if (ALL_CHECKED && SERVER_FLAG) {
        showFlagDialog();
    }
    
    function connectWebSocket() {
        ws = new WebSocket('ws://' + window.location.host + '/ws');
        
        ws.onopen = function() {
            // Request initial state when connection is established
            ws.send(JSON.stringify({ action: 'get_state' }));
        };
        
        ws.onmessage = function(event) {
            const data = JSON.parse(event.data);
            if (data.checked) {
                try {
                    // Decode base64
                    const decoded = atob(data.checked);
                    // Convert to Uint8Array for pako
                    const compressed = new Uint8Array(decoded.length);
                    for (let i = 0; i < decoded.length; i++) {
                        compressed[i] = decoded.charCodeAt(i);
                    }
                    // Decompress using pako
                    const decompressed = pako.inflate(compressed, { to: 'string' });
                    // Parse JSON
                    const checkboxList = JSON.parse(decompressed);
                    
                    checkedBoxes = new Set(checkboxList);
                    updateUI();
                    
                    // Hide loading overlay and show content
                    if (loadingOverlay) {
                        loadingOverlay.style.display = 'none';
                    }
                    if (content) {
                        content.classList.add('loaded');
                    }
                    
                    // Load initial batch of checkboxes
                    loadMoreCheckboxes();
                } catch (e) {
                    console.error('Error processing compressed data:', e);
                }
            }
            if (data.error) {
                console.error('WebSocket error:', data.error);
            }
        };

        ws.onclose = function() {
            console.log('WebSocket closed, reconnecting...');
            setTimeout(connectWebSocket, 1000);
        };
    }

    function updateUI() {
        document.getElementById('checked-count').textContent = checkedBoxes.size.toLocaleString();
        
        // Show flag dialog if all checkboxes are checked
        if (checkedBoxes.size === TOTAL_CHECKBOXES && SERVER_FLAG) {
            showFlagDialog();
        } else {
            // Hide flag if not all checkboxes are checked
            flagContainer.style.display = 'none';
        }
    }

    function showFlagDialog() {
        flagElement.textContent = SERVER_FLAG;
        flagContainer.style.display = 'block';
        
        // Trigger confetti
        confetti({
            particleCount: 100,
            spread: 70,
            origin: { y: 0.6 }
        });
    }

    function loadMoreCheckboxes() {
        if (isLoading || !hasMoreCheckboxes) return;
        
        isLoading = true;
        const start = currentPage * CHECKBOXES_PER_PAGE;
        const end = Math.min(start + CHECKBOXES_PER_PAGE, TOTAL_CHECKBOXES);
        
        // Create a document fragment for better performance
        const fragment = document.createDocumentFragment();
        
        for (let i = start; i < end; i++) {
            const checkboxContainer = document.createElement('div');
            checkboxContainer.className = 'checkbox-container';
            
            const checkbox = document.createElement('input');
            checkbox.type = 'checkbox';
            checkbox.id = `checkbox-${i}`;
            checkbox.checked = checkedBoxes.has(i);
            
            checkbox.addEventListener('change', function() {
                const numbers = [i];
                if (this.checked) {
                    ws.send(JSON.stringify({
                        action: 'check',
                        numbers: numbers
                    }));
                } else {
                    ws.send(JSON.stringify({
                        action: 'uncheck',
                        numbers: numbers
                    }));
                }
            });
            
            checkboxContainer.appendChild(checkbox);
            fragment.appendChild(checkboxContainer);
        }
        
        // Append all new checkboxes at once
        checkboxGrid.appendChild(fragment);
        
        currentPage++;
        isLoading = false;
        
        // Check if we've reached the end
        if (end >= TOTAL_CHECKBOXES) {
            hasMoreCheckboxes = false;
        }
    }

    // Initial setup
    connectWebSocket();

    // Handle page navigation with debouncing
    let scrollTimeout;
    window.addEventListener('scroll', function() {
        if (scrollTimeout) {
            clearTimeout(scrollTimeout);
        }
        
        scrollTimeout = setTimeout(function() {
            const scrollPosition = window.scrollY;
            const windowHeight = window.innerHeight;
            const documentHeight = document.documentElement.scrollHeight;
            
            // Load more when user is near the bottom
            if (scrollPosition + windowHeight >= documentHeight - 500) {
                loadMoreCheckboxes();
            }
        }, 100); // Debounce scroll events
    });
}); 