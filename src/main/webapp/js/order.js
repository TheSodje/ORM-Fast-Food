const orderTable = document.querySelector("#order-table");
// Fetch data from db
fetch("http://localhost:8888/ormFastFood_war_exploded/api/orders/getOrders")
  .then((response) => response.json())
  .then((orders) => {
    orders.forEach((order) => {
      const row = document.createElement("tr");
      row.innerHTML = `
        <td style="width:100px">${order.id}</td>
        <td style="width:100px">${order.order_code}</td>
        <td style="width:150px">${order.order_status}</td>
        <td style="width:150px">$ ${order.order_date}</td>
        <td style="width:100px">$ ${order.price}</td>
        <td>
            <a class="btn btn-sm btn-success start" data-id="${order.id}">Start</a>
            <a class="btn btn-sm btn-warning stop" data-id="${order.id}">Stop</a>
            <a class="btn btn-sm btn-info view" data-id="${order.id}">View</a>
            <a class="btn btn-sm btn-danger delete" data-id="${order.id}">Delete</a>
        </td>
      `;
      orderTable.appendChild(row);
    });
  })
  .catch((error) => {
    console.error("Error fetching orders:", error);
  });
