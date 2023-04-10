const ProductModel = require("../models/product");

const transformer = product => ({
  type: 'product',
    attributes: {
      name: product.name,
      price: product.price,
    },
    links: {
      self: `/api/v1/products/${product._id}`,
    }
});

const universilyzer = req => {
  let id;
  if (req.query.id){
    id = req.query.id;
  }
  if (req.params.id){
    id = req.params.id;
  }
  return id;
}

const findProduct = async id => {
  const product = await ProductModel.findOne({_id: id});

  return product;
}

const getAllProducts = async (req, h) => {
  const products = await ProductModel.find({});

  return { data: products.map(transformer) }; //Já está no padrão JSON:API
};

const getProductbyId = async (req, h) => {
  const id = universilyzer(req);

  const product = await findProduct(id);

  return {data: transformer(product)}; //Já está no padrão JSON:API
};

const saveProduct = async (req, h) => {

  const { name, price } = req.payload;

  const product = new ProductModel({ name, price });

  await product.save();

  return h.response({data : transformer(product)}).code(201); //Já está no padrão JSON:API
};

const updateProduct = async (req, h) => {
  const id = universilyzer(req);

  const { name, price } = req.payload;

  await ProductModel.updateOne({_id: id}, { name, price }).lean();

  const product = await ProductModel.findOne({_id: id});

  return h.response({data : transformer(product)}).code(200); //Já está no padrão JSON:API
};

const removeProduct = async (req, h) => {
  const id = universilyzer(req);

  await ProductModel.findOneAndDelete({_id: id});

  return h.response().code(204); //Já está no padrão JSON:API
};

module.exports = {
  getAllProducts,
  getProductbyId,
  saveProduct,
  updateProduct,
  removeProduct,
};