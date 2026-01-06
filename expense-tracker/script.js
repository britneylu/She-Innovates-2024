// Student.java logic in JS
let totalBudget = 0;
let remainingBalance = 0;

let expenses = {
    Food: 0,
    Transportation: 0,
    Entertainment: 0,
    "School Supplies": 0,
    Other: 0
};

function setBudget() {
    const input = document.getElementById("budgetInput").value;

    if (input <= 0) {
        alert("Please enter a valid budget.");
        return;
    }

    totalBudget = Number(input);
    remainingBalance = totalBudget;

    document.getElementById("expenseSection").classList.remove("hidden");
    document.getElementById("summary").classList.remove("hidden");
    document.getElementById("breakdown").classList.remove("hidden");

    updateUI();
}

function addExpense() {
    const category = document.getElementById("category").value;
    const amount = Number(document.getElementById("amount").value);

    if (amount <= 0 || amount > remainingBalance) {
        alert("Invalid amount or insufficient balance.");
        return;
    }

    expenses[category] += amount;
    remainingBalance -= amount;

    document.getElementById("amount").value = "";
    updateUI();
}

function updateUI() {
    document.getElementById("balance").textContent = remainingBalance.toFixed(2);
    document.getElementById("spent").textContent =
        (totalBudget - remainingBalance).toFixed(2);

    const list = document.getElementById("categoryList");
    list.innerHTML = "";

    for (let category in expenses) {
        const li = document.createElement("li");
        li.textContent = `${category}: $${expenses[category].toFixed(2)}`;
        list.appendChild(li);
    }
}