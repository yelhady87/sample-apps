var express = require('express');
var app = express();

var port = 3000

const router = express.Router()
const echo_server_routes = require('./echo-server-routes')(router, {})

app.get('/', function(req, res) {
    res.send("Hello from root")
    console.log("Got request for root at %s", new Date())
})

app.use('/echo-server', echo_server_routes)

var server = app.listen(port, function () {
   var host = server.address().address
   console.log("Echo server listening at http://%s:%s", host, port)
})