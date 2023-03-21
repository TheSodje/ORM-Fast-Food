const orderTable = document.querySelector("#order-table");
// Fetch data from db
fetch("http://localhost:8888/ormFastFood_war/api/orders/get_orders")
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
      orderTable.appendChild(row);
    });
  })
  .catch((error) => {
    console.error("Error fetching products:", error);
  });
