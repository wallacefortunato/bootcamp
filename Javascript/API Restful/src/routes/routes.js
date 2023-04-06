const productsHandler = require("../handlers/products.js");
module.exports = [
  {
    method: "GET",
    path: "/api/v1/products",
    handler: productsHandler.getAllProducts,
  },
  {
    method: "POST",
    path: "/api/v1/products",
    handler: productsHandler.saveProduct,
  },
]