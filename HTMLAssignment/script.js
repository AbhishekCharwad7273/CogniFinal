
function printValue()
{
    var name=document.getElementById("uname").value;
    var date=document.getElementById("udate").value;
    var num=document.getElementById("unum").value;
    var occupation=document.getElementById("uoccupation").value;
    var type=document.getElementById("utype").value;
    var id=document.getElementById("uid").value;
    var auth=document.getElementById("uauth").value;
    var state=document.getElementById("ustate").value;
    var issuedate=document.getElementById("uissuedate").value;
    var expiredate=document.getElementById("uexpiredate").value;

    document.writeln("your info: <br>"+"name : "+name+"<br");
    document.writeln("your info: <br>"+"date of birth : "+date+"<br");
    document.writeln("your info: <br>"+"Mobile num : "+num+"<br");
    document.writeln("your info: <br>"+"Occupation: "+occupation+"<br");
    document.writeln("your info: <br>"+"Id Type: "+type+"<br");
    document.writeln("your info: <br>"+"Id no: "+id+"<br");
    document.writeln("your info: <br>"+"Issued Authority: "+auth+"<br");
    document.writeln("your info: <br>"+"state: "+state+"<br");
    document.writeln("your info: <br>"+"Issued Date: "+issuedate+"<br");
    document.writeln("your info: <br>"+"Expired Date: "+expiredate+"<br");

   

}



















/*
        function validation() {
          
            var username = document.getElementById('uname').value;
            var useremail = document.getElementById('umail').value;
            var usernumber = document.getElementById('unum').value;
            var useroccupation = document.getElementById('uoccupation').value;
          
            var userid = document.getElementById('uid').value;
            var userauth = document.getElementById('uauth').value;
            var userstate = document.getElementById('ustate').value;




            var userchk = /^[A-Za-z. ]{3,30}$/
            var emailchk=/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
            var numberchk=/^[789][0-9]{9}$/
            var Occupationchk=/^[A-Za-z. ]{3,30}$/
            var idchk=/^[0-9]{9}$/
            var authchk=/^[A-Za-z. ]{3,30}$/
            var statechk=/^[A-Za-z. ]{3,30}$/


            if(userchk.test(username))
            {
                document.getElementById('usererror').innerHTML=" "
            }
            else
            {
                document.getElementById('usererror').innerHTML="** user name is invalid "
                return false;
            }
            if(emailchk.test(useremail))
            {
                document.getElementById('useremailerror').innerHTML=" "
            }
            else
            {
                document.getElementById('useremailerror').innerHTML="** user email is invalid "
                return false;
            }
            if(numberchk.test(usernumber))
            {
                document.getElementById('usernumbererror').innerHTML=" "
            }
            else
            {
                document.getElementById('usernumbererror').innerHTML="** user number is invalid "
                return false;
            }
            if(Occupationchk.test(useroccupation))
            {
                document.getElementById('Occupationerror').innerHTML=" "
            }
            else
            {
                document.getElementById('Occupationerror').innerHTML="** user Occupation is invalid "
                return false;
            }
            if(idchk.test(userid ))
            {
                document.getElementById('userIDerro').innerHTML=" "
            }
            else
            {
                document.getElementById('userIDerro').innerHTML="** user Id is invalid "
                return false;
            }
            if(authchk.test(userauth))
            {
                document.getElementById('userAutherror').innerHTML=" "
            }
            else
            {
                document.getElementById('userAutherror').innerHTML="** user Authentication is invalid "
                return false;
            }

            if(statechk.test(userstate))
            {
                document.getElementById('userstateerror').innerHTML=" "
            }
            else
            {
                document.getElementById('userstateerror').innerHTML="** user State is invalid "
                return false;
            }
            
          
    }


*/



function printValue()
    {
        var name=document.getElementById("uname").value;
        var date=document.getElementById("udate").value;
        var num=document.getElementById("unum").value;
        var occupation=document.getElementById("uoccupation").value;
        var type=document.getElementById("utype").value;
        var id=document.getElementById("uid").value;
        var auth=document.getElementById("uauth").value;
        var state=document.getElementById("ustate").value;
        var issuedate=document.getElementById("uissuedate").value;
        var expiredate=document.getElementById("uexpiredate").value;

        document.writeln("your info: <br>"+"name : "+name+"<br");
        document.writeln("your info: <br>"+"date of birth : "+date+"<br");
        document.writeln("your info: <br>"+"Mobile num : "+num+"<br");
        document.writeln("your info: <br>"+"Occupation: "+occupation+"<br");
        document.writeln("your info: <br>"+"Id Type: "+type+"<br");
        document.writeln("your info: <br>"+"Id no: "+id+"<br");
        document.writeln("your info: <br>"+"Issued Authority: "+auth+"<br");
        document.writeln("your info: <br>"+"state: "+state+"<br");
        document.writeln("your info: <br>"+"Issued Date: "+issuedate+"<br");
        document.writeln("your info: <br>"+"Expired Date: "+expiredate+"<br");

       

    }

