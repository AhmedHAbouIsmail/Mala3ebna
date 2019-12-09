
const express = require ("express")
const app = express();
app.use(express.json())
const client = require("./config")


app.get("/", async (req, res) => {
    const results = await client.query("select * from Mala3ebna");
    const rows =   results.rows;
    res.send(JSON.stringify(rows))
})

app.get("/name", async (req, res) => {
    const results = await client.query("select name from mala3ebna");
    const rows =   results.rows;
    
    res.send(JSON.stringify(rows))
})

app.get("/name/:name", async (req, res) => {
    var name = req.params.name;
    const results = await client.query("select * from mala3ebna where name = '"+name+"' ");
    const rows =   results.rows;
    
    res.send(JSON.stringify(rows))
})

app.get("/location", async (req, res) => {
    const results = await client.query("select name,location from mala3ebna");
    const rows =   results.rows;
    
    res.send(JSON.stringify(rows))
})

app.get("/price", async (req, res) => {
    const results = await client.query("select  name,price from mala3ebna");
    const rows =   results.rows;
    
    res.send(JSON.stringify(rows))
})


app.get("/time/:timeneeded", async (req, res) => {
    var timeneeded = req.params.timeneeded
   
    const results = await client.query('select name from mala3ebna where "'+timeneeded+'" = true');
    const rows =   results.rows;
 
    res.send(JSON.stringify(rows))
})

app.get("/location/:loc", async (req, res) => {
    var loc = req.params.loc;
    const results = await client.query("select name, location from mala3ebna where location = '"+loc+"' ");
    const rows =   results.rows;
    
    res.send(JSON.stringify(rows))
})


app.get("/time/reserve/:n/:timeneeded1", async (req, res) => {
    var timeneeded1 = req.params.timeneeded1;
   var n = req.params.n;
   
   
   
    
    if (await client.query('select "' + timeneeded1 + '"' +"from mala3ebna where name ='" +n+ "'"))
    {
        const results = await client.query('UPDATE Mala3ebna SET "'+ timeneeded1 + '"' + " = false  where name ='" +n+ "'") ;

        const rows =   results.rows;
        res.send(JSON.stringify(rows))
    }
    else{
        console.log("reserved already");
    }
})



  app.listen(4000,()=> console.log("web is running"))

  start()

  async function start() {
      await connect();
  }
  
  async function connect() {
      try {
          await client.connect();
      }
      catch(e) {
          console.error(`Failed to connect ${e}`)
      }
  }
