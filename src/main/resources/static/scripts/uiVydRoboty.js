// A $( document ).ready() block.
$( document ).ready(function() {
    console.log("Ready!");

     getAllVydRoboty(function (response) {
                console.log("filling table with data..." + JSON.stringify(response))
                $("#tableVydRoboty").DataTable( {
                    responsive: true,
                    "processing": true,
                    "bAutoWidth" : false,
                    "aaData": response,
                    "columns" : [ {
                        "data" : "idVydRoboty"
                    }, {
                        "data" : "nazvaVyduRoboty"
                    } ]
                } );
            });
});