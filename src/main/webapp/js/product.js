// Admin Product table
function getAllProducts() {
  const productTable = document.querySelector("#product-table");
  // Fetch data from db
  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/get_products"
  )
    .then((response) => response.json())
    .then((products) => {
      products.forEach((product) => {
        const row = document.createElement("tr");
        row.innerHTML = `
        <td style="width:150px">${product.name}</td>
        <td style="width:500px">${product.description}</td>
        <td style="width:150px">${product.type}</td>
        <td style="width:100px">$ ${product.price}</td>
        <td>
            <button class="btn btn-sm btn-info update" data-id="${product.id}">Update</button>
            <button class="btn btn-sm btn-danger delete" data-id="${product.id}">Delete</button>
        </td>
      `;
        productTable.appendChild(row);
      });
    })
    .catch((error) => {
      console.error("Error fetching products:", error);
    });
}

// Menu page
function getProductMenu() {
  // Main Page Single Product
  const productMenu = document.querySelector("#productMenu");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/get_products"
  )
    .then((response) => response.json())
    .then((products) => {
      products.forEach((product) => {
        let div = document.createElement("div");
        div.classList.add('col-12', 'col-md-4', 'col-lg-3', 'mb-5', 'mt-2');
        div.innerHTML = `
            <div class="card mb-3">
              <img src="../img/products/sample 3.png" class="card-img-top">
              <div class="card-body">
                <h5 class="card-title">${product.name}</h5>
                <p class="card-text fst-italic">${product.type}</p>
                <p class="card-text fw-bold fs-3 text">$ ${product.price}</p>
              </div>
            </div>
       `;
        productMenu.append(div);
      });
    })
    .catch((error) => {
      console.error("Error fetching products:", error);
    });
}

function getSingleProduct1() {
  // Main Page Single Product
  const mainProduct1 = document.querySelector("#mainProduct1");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/get_product/2"
  )
    .then((response) => response.json())
    .then((products) => {
      console.log(products);
      console.log(products[0].description);
      mainProduct1.append(products[0].description);
    })
    .catch((error) => {
      console.error("Error fetching product:", error);
    });
}

function getSingleProduct2() {
  // Main Page Single Product
  const mainProduct2 = document.querySelector("#mainProduct2");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/get_product/1"
  )
    .then((response) => response.json())
    .then((products) => {
      console.log(products);
      console.log(products[0].description);
      mainProduct2.append(products[0].description);
      // let p =
      //   `${products[0].description}`;
      // mainProduct2.append(p);
    })
    .catch((error) => {
      console.error("Error fetching product:", error);
    });
}
