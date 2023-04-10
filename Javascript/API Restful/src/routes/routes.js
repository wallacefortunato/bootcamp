const productsHandler = require("../api/handlers/products.js");
module.exports = [
  {
    method: "GET",
    path: "/api/v1/products",
    handler: productsHandler.getAllProducts,
  },
  {
    method: "GET",
    path: "/api/v1/products/{id}",
    handler: productsHandler.getProductbyId,
  },
  {
    method: "GET",
    path: "/api/v1/products/",
    handler: productsHandler.getProductbyId,
  },
  {
    method: "POST",
    path: "/api/v1/products",
    handler: productsHandler.saveProduct,
  },
  {
    method: "PUT",
    path: "/api/v1/products/{id}",
    handler: productsHandler.updateProduct,
  },
  {
    method: "PUT",
    path: "/api/v1/products/",
    handler: productsHandler.updateProduct,
  },
  {
    method: "DELETE",
    path: "/api/v1/products/{id}",
    handler: productsHandler.removeProduct,
  },
  {
    method: "DELETE",
    path: "/api/v1/products/",
    handler: productsHandler.removeProduct,
  },
]