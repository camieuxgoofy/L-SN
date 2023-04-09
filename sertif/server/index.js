const express = require("express");
const mysql = require('mysql');
const cors = require('cors');

const app = express();

app.use(cors());
app.use(express.json());
const db = mysql.createConnection({
    host: "localhost",
    user: "camieux",
    password: "viper666",
    database: "citizens_db"
})

app.post('/login', (req, res) => {
    const sql = "SELECT * FROM users WHERE username = ? AND password = ?";
    db.query(sql, [req.body.email, req.body.password], (err, data) => {
        const errors = validationResult(req);
        if (!errors.isEmpty()) {
            return res.json(errors);
        } else {
            if (err) {
                return res.json("Error");
            }
            if (data.length > 0) {
                return res.json("Success");
            } else {
                return res.json("Faile");
            }
        }
    })
})
app.listen(8081, () => {
    console.log("listening");
})