module.exports = (app) => {

   app.get('/', (req, res) => {
        console.log("Got request for echo-server at %s", new Date())
        res.send("Hello from echo-server")

   });

   app.get('/echo', function (req, res) {
    var message = 'Echo BACK!!';
    if (req.query.message) message = req.query.message

    var response = `Hello from ${message}`
    console.log("Got echo request at %s , response is %s", new Date(), response)
    
    res.send(response);
})

   return app; 
};