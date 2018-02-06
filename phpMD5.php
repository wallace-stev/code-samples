<?php
	
	//initial password
	$saved_password = md5('password');
	
	if (isset($_POST["user_password"])&& !empty($_POST["user_password"])){
		$input_password = md5($_POST["user_password"]);
		if ($input_password===$saved_password){
			echo "Correct password<br>";
			echo "Encrypted password is: " .$saved_password ."<br>";
		}
		else{
			echo "Incorrect password";
		}
	}
	else {
		echo "please enter a password";
	}
?> 

<form action="phplearn.php" method="POST" >
	Password: <input type="password" name="user_password" required><br><br>
	<input type="button" value="Submit" >
</form>
	