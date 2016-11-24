<?php

	while (1) {
		$i = rtrim(fgets(STDIN));
		if ($i == 42)
			break;
		echo $i . "\n";
	} 
?>
