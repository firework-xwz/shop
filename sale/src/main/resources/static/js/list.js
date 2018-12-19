function show(tar) {
    var id=tar.getAttribute('data-id');
    alert(id);
    var data={
        'id':id
    }
    console.log(data);
    $.ajax({
            url: "/single1",
            type: "GET",
            data:data,
            dataType:"json",
        success:function (result) {
                console.log("sus");
                console.log(result);
            window.location.href="/single";
        },
        error:function () {
            console.log("fail");
        }
        }
    )
}