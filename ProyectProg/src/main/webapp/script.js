const xhr = new XMLHttpRequest();
xhr.open('get','servlet-test?code=234563',true)
xhr.onreadystatechange = ()=>{
    if( xhr.readyState === 4 && xhr.status === 200 ){
        const students = JSON.parse( xhr.responseText)
        console.log( xhr.responseText)
        //students.forEach( student => alert(`${student.code} ${student.surname} ${student.name}`))
    }
}
xhr.send(null)

document.getElementById('Enviar').addEventListener('click',()=>{
    //alert('Migueeeeeeeeeeee WHaaa saaaaa')
    const code= document.getElementById('code').value;
    const sport= document.getElementById('deporte').value;
    const name= document.getElementById('nombre').value;
    const activity= document.getElementById('actividad').value;

    const xhr = new XMLHttpRequest();
    xhr.open('post','servlet-test',true)
    xhr.onreadystatechange = ()=>{
        if( xhr.readyState === 4 && xhr.status === 200 ){
            //alert(xhr.responseText+" lol ")


        }
    }
    const data = `code=${code}&sport=${sport}&name=${name}&activity=${activity}`;
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xhr.send( data )
    //alert(data)

})
