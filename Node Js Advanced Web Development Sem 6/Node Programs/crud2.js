const mongoose = require('mongoose');
mongoose.connect("mongodb://localhost:27017/ecomm1")
const productSchema = new mongoose.Schema({
    modelnum: Number,
    name: String,
    price: Number
});
const Product = mongoose.model('products', productSchema);


// let data = new Product({ modelnum: 4, name: "Smartwath", price: 8000 });
// data.save()
//     .then((doc) => {
//         console.log(doc);
//     })
//     .catch((err) => {
//         console.log(err);
//     });


// Product.find({})
//     .then((doc) => {
//         console.log(doc);
//     })
//     .catch((err) => {
//         console.log(err);
//     });


// Product.find({ modelnum: 4 })
//     .then((doc) => {
//         console.log(doc);
//     })
//     .catch((err) => {
//         console.log(err);
//     });


// Product.findByIdAndUpdate("66161c41f57db9627e2e963c", { price: 5000 }, { new: true })
//     .then((doc) => {
//         console.log(doc);
//     })
//     .catch((err) => {
//         console.log(err);
//     });


// Product.findByIdAndDelete("66161c41f57db9627e2e963c")
//     .then((doc) => {
//         console.log(doc);
//     })
//     .catch((err) => {
//         console.log(err);
//     });