from urllib.parse import urlparse

def validate_url(url: str, target_domain: str = None) -> bool:
    try:
        parsed = urlparse(url)
        print(f"Parsed URL: {parsed}")
        if parsed.scheme not in ('http', 'https') or not parsed.hostname:
            return False
        if target_domain and parsed.hostname != target_domain:
            return False
        return True
    except Exception:
        return False
