function validatestudent()
{
	var numre=/[0-9]/;
	namere=/[A-Za-z]/;
	var name=document.forms["studentform"]["name"].value;
	if(!(namere.test(name) || name==null))
		{
		alert("Name should be filled with characters");
		return false;
		}
	var age=document.forms["studentform"]["age"].value;
	var numre=/[0-9]/;
	if(!(numre.test(age) || age==null))
		{
		alert("Age should be filled with Numbers");
		if(age.length>2)
			{
			alert("please enter valid age");
			}
		return false;
		}
	var address=document.forms["studentform"]["address"].value;
	if(!(namere.test(address) || name==null))
		{
		alert("Address should be filled with characters");
		return false;
		}
	var city=document.forms["studentform"]["city"].value;
	if(!(namere.test(city) || name==null))
		{
		alert("City should be filled with characters");
		return false;
		}
	var age=document.forms["studentform"]["age"].value;

	if(!(numre.test(age) || age==null))
		{
		alert("Age should be filled with Numbers");
		if(age.length>5)
			{
			alert("please enter valid age");
			}
		return false;
		}
	var username=document.forms["studentform"]["username"].value;
	if(!(namere.test(username) || name==null))
		{
		alert("User Nameshould be filled with characters");
		return false;
		}
	var password=document.forms["studentform"]["password"].value;
	if(!(namere.test(password) || name==null))
		{
		alert("Please enter password correctly");
		return false;
		}
	}