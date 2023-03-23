// Fetch data from db contact
function getAllMessages() {
  const feedbackTable = document.querySelector("#feedback-table");
  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/contact/getContacts"
  )
    .then((response) => response.json())
    .then((messages) => {
      messages.forEach((message) => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td style="width:100px">${message.name}</td>
          <td style="width:150px">${message.email}</td>
          <td style="width:100px">${message.number}</td>
          <td style="width:250px">${message.message}</td>
        `;
        feedbackTable.appendChild(row);
      });
    })
    .catch((error) => {
      console.error("Error fetching messages:", error);
    });
}

//fetch data from user report with their role and department
function getEmployeeRole() {
  const overviewTable = document.querySelector("#overview-table");
  fetch(
    "http://localhost:8888/ormFastFood_war_exploded/api/user/getUserRoleDepartment"
  )
    .then((response) => response.json())
    .then((results) => {
      console.log(results);
      results.forEach((result) => {
        const row = document.createElement("tr");
        row.innerHTML = `
          <td style="width:150px">${result[0]}</td>
          <td style="width:150px">${result[1]}</td>
          <td style="width:150px">${result[2]}</td>
          <td style="width:150px">${result[3]}</td>
        `;
        overviewTable.appendChild(row);
      });
    })
    .catch((error) => {
      console.error("Error fetching messages:", error);
    });
}