function GetData() {
    $.ajax({
        type: "GET",
        contentType: 'application/json; charset=utf-8',
        processData: false,
        url: "https://reqres.in/api/users?page=1",
        cache: false,
        dataType: "json"
    }).done(function (data) {
        var div1=document.createElement("div");
        div1.className="topDiv";
        document.body.appendChild(div1);
        for ( var i=0 ; i < data.data.length ; i++){
            var div=document.createElement("div");
            div.className="header";
            document.body.appendChild(div);

            var p=document.createElement("p");
            p.innerHTML=" <b>Customer Information :-</b>";
            div.appendChild(p);

            var pid1=document.createElement("p");
            pid1.innerHTML="------------------------";
            div.appendChild(pid1);

            var pid=document.createElement("p");
            pid.innerHTML="<b>ID</b> : "+data.data[i].id;
            div.appendChild(pid);
            


            var pemail=document.createElement("p");
            pemail.innerHTML="<b>Email</b> : "+data.data[i].email;
            div.appendChild(pemail);


            var pfirst_name=document.createElement("p");
            pfirst_name.innerHTML="<b>First Name</b> :"+data.data[i].first_name;
            div.appendChild(pfirst_name);


            var plast_name=document.createElement("p");
            plast_name.innerHTML="<b>Last Name</b> : "+data.data[i].last_name;
            div.appendChild(plast_name);

            var x = document.createElement("IMG");
            x.setAttribute("src", data.data[i].avatar);
            div.appendChild(x);
            div1.appendChild(div);
        }
       
    });
}





