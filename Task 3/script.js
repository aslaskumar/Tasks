
var div=document.createElement("div");
div.className="header";
document.body.appendChild(div);

var p=document.createElement("p");
p.innerHTML="List of Todo Task :";
div.appendChild(p);

var s=document.createElement("span");
s.id="sid";
p.appendChild(s);


var input=document.createElement("input");
input.id="myInput";
input.placeholder="Title...";
div.appendChild(input);
var button=document.createElement("button");
button.className="addBtn";
button.innerHTML="Add Activity";
button.addEventListener("click",newElement);
div.appendChild(button);


var span=document.createElement("span");
span.id="count";
p.appendChild(span);



var list=document.createElement("ul");
list.tagName="ul";
list.id="myUL";
document.body.appendChild(list);

var myNodelist=document.createElement("li");
myNodelist.className="checked";
myNodelist.tagName="li";
myNodelist.innerHTML="Breakfast";
list.appendChild(myNodelist);






 var myNodelist = document.getElementsByTagName("li");
var i;
for (i = 0; i < myNodelist.length; i++) {
  var span2 = document.createElement("span2");
  var txt = document.createTextNode("  ");
  // span2.className = "close";
  // span2.appendChild(txt);
  // myNodelist[i].appendChild(span2);
}



// var close = document.getElementsByClassName("close");
var i;
for (i = 0; i < close.length; i++) {
  close[i].onclick = function() {
  var div = this.parentElement;
 // div.style.display = "none";
  }
}

// var list = document.querySelector('list');
list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
  ev.target.classList.toggle('checked');
  }
}, false);

function newElement() {
  var li = document.createElement("li");
  var inputValue = document.getElementById("myInput").value;
  console.log(inputValue);
  var t = document.createTextNode(inputValue);
  li.appendChild(t);
  if (inputValue === '') {
  alert("give the todo lists!");
  } else {
    document.getElementById("myUL").appendChild(li);
    document.getElementById("sid").innerHTML=close.length;
  }
  document.getElementById("myInput").value = "";
 // document.getElementById('count').innerHTML=idCount;

//   var span = document.createElement("SPAN");


 for (i = 0; i < close.length; i++) {
    close[i].onclick = function() {
        var div = this.parentElement;
        div.style.display = "none";
    } 
  } 
}

function removeAll(){
  var lst = document.getElementsByTagName("ul");
    lst[0].innerHTML = "";
}

