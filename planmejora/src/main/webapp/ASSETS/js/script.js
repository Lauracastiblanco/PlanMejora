function love(){
    var name1 = document.getElementById("your-name").value;
    var name2 = document.getElementById("crush-name").value;
    if(name1.length<=2){
        Swal.fire({title: 'Escribe tu nombre, para continuar',
        confirmButtonColor: "#ffc1d3"})
    }
    if(name2.length<=2){
        Swal.fire({title:'Escribe los nombres para continuar', 
        confirmButtonColor: "#ffc1d3"})
    }
    else{
        var random = Math.floor(Math.random()*100);
        Swal.fire({
            title: "Compatibilidad", 
            text: name1 + " y " + name2 + " = " + random + "%" + " de compatibilidad", 
            width: 600,
            padding: '3em',
            background: '#ffc1d3',
            imageUrl: 'https://o.remove.bg/downloads/4e0f973f-3bc7-4eeb-bb98-365c7629e0f1/corazon-rosa-WhatsApp-removebg-preview.png',
            imageWidth: 200, 
            imageheight: 200, 
            backdrop: `
            rgba(0,0,123,0.4)
            url("https://azgif.com/wp-content/uploads/2019/12/Gif-peque%C3%B1os-corazones-cayendo-1.gif")
            left top
            repeat`,
            confirmButtonColor: "#e2889b"
        })
    }
    if(random<=10 || random<=50){
        document.getElementById("statement").innerHTML = "Good Relationship";
    }
    else if(random<=51 || random<=100){
        document.getElementById("statement").innerHTML = "Lovely Relationship";
    }
}