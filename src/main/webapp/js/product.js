// Admin Product table
function getAllProducts() {
  const productTable = document.querySelector("#product-table");
  // Fetch data from db
  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/getProducts"
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
            <button class="btn btn-sm btn-danger delete" id="deleteP" data-id="${product.id}">Delete</button>
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
  const productMenu = document.querySelector("#productMenu");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/getProducts"
  )
    .then((response) => response.json())
    .then((products) => {
      products.forEach((product) => {
        let div = document.createElement("div");
        div.classList.add("col-12", "col-md-4", "col-lg-3", "mb-5", "mt-2");
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

// Main Page Single Product
function getSingleProduct1() {
  const mainProduct1 = document.querySelector("#mainProduct1");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/getProduct/2"
  )
    .then((response) => response.json())
    .then((products) => {
      console.log(products);
      console.log(products.description);
      mainProduct1.append(products.description);
    })
    .catch((error) => {
      console.error("Error fetching product:", error);
    });
}

function getSingleProduct2() {
  const mainProduct2 = document.querySelector("#mainProduct2");

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/getProduct/1"
  )
    .then((response) => response.json())
    .then((products) => {
      console.log(products);
      console.log(products.description);
      mainProduct2.append(products.description);
    })
    .catch((error) => {
      console.error("Error fetching product:", error);
    });
}

function addProduct() {
  let name = $("#name").val();
  let type = $("#type").val();
  let description = $("#description").val();
  let price = $("#price").val();

  console.log(name, type, description, price);

  var xhr = new XMLHttpRequest();
  xhr.open(
    "POST",
    "http://localhost:8888/ormFastFood_war_exploded/api/product/addProduct"
  );
  xhr.setRequestHeader("Content-Type", "application/json");

  xhr.onload = function () {
    if (xhr.status == 200) {
      alert("Contact added successfully!");
      document.getElementById("addProductForm").reset();
      // window.location.reload();
    } else {
      alert("Error adding Contact");
    }
  };

  xhr.send(
    JSON.stringify({
      name: name,
      type: type,
      description: description,
      price: price,
    })
  );
}

async function deleteProduct(id) {
  const options = {
    method: "DELETE",
  };

  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/product/deleteProduct/" +
      id,
    options
  )
    .then((response) => {
      if (!response.ok) {
        console.log("There was a problem deleting the product.");
        return;
      }
      response.json;
    })
    .then((data) => console.log("Product is deleted succesfully!"));
}
