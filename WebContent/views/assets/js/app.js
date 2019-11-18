window.addEventListener('load', () => {
	document.querySelector('.submit').addEventListener('click', () => {
		let file = document.querySelector('#file').files[0];
		if(file == undefined){
			alert("파일을 업로드해주세요.");
			return;
		}
		
		document.querySelector('form').submit();
		
	});
});