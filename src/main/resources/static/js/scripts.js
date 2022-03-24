var xmlhttp = new XMLHttpRequest();
var url = "http://localhost:8080/api/produtos";

xmlhttp.onreadystatechange = function() {
  if (this.readyState == 4 && this.status == 200) {
    var myArr = JSON.parse(this.responseText);
    myFunction(myArr);
    console.log("ReadState = " + this.readyState + " Status = " + this.status);
  }
};
xmlhttp.open("GET", url, true);
xmlhttp.send();

function myFunction(arr) {
  var out = "";
  var i;

var table = document.getElementById('produtos');
for(i = 0; i < arr.length; i++) {
    var tr = document.createElement('tr');
    var td1 = document.createElement('td');
    var td2 = document.createElement('td');
    var td3 = document.createElement('td');

    var text1 = document.createTextNode(arr[i].nome);
    var text2 = document.createTextNode(arr[i].descricao);
    var text3 = document.createTextNode(arr[i].img);

    td1.appendChild(text1);
    td2.appendChild(text2);
    td3.appendChild(text3);
    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);

    table.appendChild(tr);
}
document.body.appendChild(table);

}