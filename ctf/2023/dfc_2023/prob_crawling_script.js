var elements = document.getElementsByClassName('elementor-inner')[0].getElementsByTagName('section')[3];
var cols = elements.getElementsByClassName('elementor-column');
var cols_len = cols.length;
var rows = null;
var link = null;
var pw = null;
var rows_len = 0;
var real_cnt = 0;

for(var x = 0; x < cols_len; x++)
{
	var rows = cols[x].getElementsByClassName('elementor-element');
	var rows_len= rows.length;
	
	for(var y = 0; y < rows_len; y++){
		link = rows[y].getElementsByTagName('a')[0];
		pw = rows[y].getElementsByClassName('elementor-flip-box__layer elementor-flip-box__back')[0].getElementsByClassName('elementor-flip-box__layer__description')[0];
		if(link == undefined || pw == undefined)
			continue;
		else{
			console.log(link.href);
			console.log(pw.innerText);
			real_cnt++;
		}
	}
}

console.log(real_cnt);