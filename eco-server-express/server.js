var express = require('express');

var app = express();

var port = 3000

app.get('/echo', function (req, res) {
   
    var message = 'Echo Server';
    if (req.query.message) message = req.query.message
    
    res.send(`Hello from ${message}`);
})

var server = app.listen(port, function () {
   var host = server.address().address
   
   console.log("Echo server listening at http://%s:%s", host, port)
})