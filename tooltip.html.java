<html>
<head>
<title>Jquery tool tip</title>
<script src="./lib/jquery.js"></script>
<script>
$(function(){
	$('#testtooltip').tooltip({
		content : "This is the tool tip"
	});
});
</script>
</head>
<body>
<input type="text" id="testtooltip"/>
</body>
</html>