const express = require("express");

const app = express();
app.use(express.json());
app.use(express.urlencoded({ extended: true }));
const db = require("./app/models");
db.sequelize.sync()
  .then(() => {
    console.log("Synced db.");
  })
  .catch((err) => {
    console.log("Failed to sync db: " + err.message);
  });
require("./app/routes/turorial.routes")(app);
app.listen(8080, () => {
  console.log(`Server is running on port`);
});