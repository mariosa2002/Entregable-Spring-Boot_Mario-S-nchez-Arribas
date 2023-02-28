function delete (idStudent) {
    swal({
      title: "¿Estás seguro de que quieres eliminar a este alumno?",
      text: "Si eliminar el registro no podrás recuperarlo",
      icon: "warning",
      buttons: true,
      dangerMode: true,
    })
    .then((OK) => {
      if (OK) {
        $.ajax({
            url:"/delete/"+id,
            success: function(answer){
                console.log(answer);
            }
        });
       swal("Registro eliminado", {
        icon: "success",
        }).then((ok)=>{
            if(ok) {
                location.href="/list";
            }
        });
      }
    });
}