
  function sub(){
      debugger
    //  const xhttp = new XMLHttpRequest();
    //  xhttp.onload = function(){
       
    //  }
    //  var data = {
    //     'firstname': "x"
    //   }
    // xhttp.open("POST", "http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee");
    // xhttp.send(data);

    var http = new XMLHttpRequest();
    var deptObj={
        deptId:1,
        name:"Engineering",
        budget:1936760,
        q1:445455,
        q2:522925,
        q3:426087,
        q4:542293,
        deptCode:"Eng",
        location:"San Francisco",
        tenantId:1
    };
    var dataToSave={
        empId:1,
        firstname:"Asledsh",
        lastname:"Lin",
        street:"45 Houston Street",
        city:"Chicago",
        state:"IL",
        sisocode:"US",
        birthdate:"1973-10-21",
        picurl:"https://s3.amazonaws.com/wmstudio-apps/salesrep/Eric-Lin.png",
        jobTitle:"Director",
        deptId:1,
        username:"eric.lin",
        password:"wavemaker",
        role:"admin",
        managerId:null,
        tenantId:1,
        department:deptObj,
        employeeByManagerId:null,
    };
    var params = new Object();
params.firstname = "Asledsh";
params.empId=120;
// Turn the data object into an array of URL-encoded key/value pairs.
let urlEncodedData = "", urlEncodedDataPairs = [], name;
for( name in params ) {
 urlEncodedDataPairs.push(encodeURIComponent(name)+'='+encodeURIComponent(params[name]));
}
var url = 'http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee';

http.open('POST', url, true);

//Send the proper header information along with the request
http.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

http.onreadystatechange = function() {//Call a function when the state changes.
    if(http.readyState == 4 && http.status == 200) {
        alert(http.responseText);
    }
}
http.send(urlEncodedDataPairs);
  }


function SaveData(){
    debugger
var deptObj={
    deptId:1,
    name:"Engineering",
    budget:1936760,
    q1:445455,
    q2:522925,
    q3:426087,
    q4:542293,
    deptCode:"Eng",
    location:"San Francisco",
    tenantId:1
};
var dataToSave={
    empId:1,
    firstname:"Asledsh",
    lastname:"Lin",
    street:"45 Houston Street",
    city:"Chicago",
    state:"IL",
    sisocode:"US",
    birthdate:"1973-10-21",
    picurl:"https://s3.amazonaws.com/wmstudio-apps/salesrep/Eric-Lin.png",
    jobTitle:"Director",
    deptId:1,
    username:"eric.lin",
    password:"wavemaker",
    role:"admin",
    managerId:null,
    tenantId:1,
    department:deptObj,
    employeeByManagerId:null,
};
var datavalue = JSON.stringify(dataToSave);
    $.ajax({
        type: "POST",
        data: datavalue,
        contentType: 'application/json; charset=utf-8',
        dataType: 'json',
        processData: false,
        url: "http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee",
        secureuri: false,
    }).done(function (dataResult) {
debugger
        alert("hhji")

    }).error(function (Result) {
        debugger
        alert("hi")
    });
    

}
  
  function GetData() {
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function() {
      const x =JSON.parse(this.responseText);
      const Data=x.content;
      console.log(Data);
      for(let i =0; i<Data.length;i++){
        var p1= document.createElement('p');

        p1.innerHTML=Data[i].firstname;
        document.getElementById("div-id").appendChild(p1);
      }

    }
    xhttp.open("GET", "http://corridor.cloud.wavemakeronline.com/EmployeesAPI/services/HRAPI/Employee");
    xhttp.send();
  }