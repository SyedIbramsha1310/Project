function goToHome(){
    
    location.href="login.html"
}
let container=document.getElementById("user_name");

let user_name=document.getElementById("user_name");
let password=document.getElementById("password");
let usermsg=document.getElementById("usermsg");

con.addEventListener("onclick", (login)=> {
    if(user_name.value=="" || user_name.value===undefined){
        alert("*user field is required")
    }
    if(password.value=="" || password.value===undefined){
        alert("*password field is required")
    }
})



function goToHome(){
    location.href="register.html"
}

let myContainer_1=document.getElementById("first_name");
let myContainer_2=document.getElementById("last_name");
let myContainer_3=document.getElementById("user_name");
let myContainer_4=document.getElementById("password");
let myContainer_5=document.getElementById("address");
let myContainer_6=document.getElementById("num");

myContainer_1.addEventListener("click",(event)=>{
    if(first_name=="" || first_name.value===undefined){
        alert("first name is required")
    }
    if(last_name=="" || last_name.value===undefined){
        alert("last name is required")
    }
    if(user_name=="" || user_name.value===undefined){
        alert("user name is required")
    }
    if(password=="" || password.value===undefined){
        alert("password is required")
    }
    if(address=="" || address===undefined){
        alert("address is required")
    }
    if(num=="" || num.value===undefined){
        alert("Contact Number is required")
    }
})


function display_ct() {
    var x = new Date()
    var x1=x.toUTCString();
    document.getElementById('ct').innerHTML = x1;
    tt=display_c();
     }

var selectRow = null;
function onFormSubmit(e){
    event.preventDefault();
    var formData = readFormData();
    if(selectRow === null){
        insertNewRecord(FormData);
    }
    else{
        updateRecord(formData);
    }
    resetForm();
}

function readFormData(){
    var readFormData;()=> {
        var formData = {};
        formData["SINo"] = document.getElementById("SINo").value;
        formData["Eid"] = document.getElementById("Eid").value;
        formData["Name"] = document.getElementById("Name").value;
        formData["Dept"] = document.getElementById("Dept").value;
        formData["Skill"] = document.getElementById("kill").value;
        formData["Salary"] = document.getElementById("Salary").value;
        return formData;
    }
}
function insertNewRecord(data){
    var table = document.getElementById("storeList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    var cell1 = newRow.insertCell(0);
        cell1.innerHTML = data.SINo;
    var cell2 = newRow.insertCell(1);
        cell2.innerHTML = data.Eid;
    var cell3 = newRow.insertCell(2);
        cell3.innerHTML = data.Name;
    var cell4 = newRow.insertCell(3);
        cell4.innerHTML = data.Dept;
    var cell5 = newRow.insertCell(4);
        cell5.innerHTML = data.Skill;
    var cell6 = newRow.insertCell(5);
        cell6.innerHTML = `<button onclick='onEdit(this)'>Edit</button> <button onclick='onDelete(this)'>Delete</button>`
                
}

function onEdit(td){
    selectRow = td.parentElement.parentElement;
    document.getElementsById('SINo').value = selectRow.cells[0].innerHTML;
    document.getElementsById('Eid').value = selectRow.cells[1].innerHTML;
    document.getElementsById('Name').value = selectRow.cells[2].innerHTML;
    document.getElementsById('Dept').value = selectRow.cells[3].innerHTML;
    document.getElementsById('Skill').value = selectRow.cells[4].innerHTML;
    document.getElementsById('Salary').value = selectRow.cells[5].innerHTML;
}

function updateRecord(formData){
    selectRow.cells[0].innerHTML = formData.SINo;
    selectRow.cells[1].innerHTML = formData.Eid;
    selectRow.cells[2].innerHTML = formData.Name;
    selectRow.cells[3].innerHTML = formData.Dept;
    selectRow.cells[4].innerHTML = formData.Skill;
    selectRow.cells[5].innerHTML = formData.Salary;
}

function onDelete(td){
    if(confirm('Do you want to delete this record?')){
        row = td.parentElement.parentElement;
        document.getElementsById('storedList').deleteRow(row.rowIndex);
    }
    resetForm();
}

function resetForm(){
    document.getElementsById('SINo').value = '';
    document.getElementsById('Eid').value = '';
    document.getElementsById('Name').value = '';
    document.getElementsById('Dept').value = '';
    document.getElementsById('Skill').value = '';
    document.getElementsById('Salary').value = '';
}