document.getElementById('calculate-btn').addEventListener('click', function() {
    const petrolCost = parseFloat(document.getElementById('petrol-cost').value);
    const litersPurchased = parseFloat(document.getElementById('liters-purchased').value);

    const totalCost = petrolCost * litersPurchased;

    document.getElementById('total-cost').textContent = `Total cost: $${totalCost.toFixed(2)}`;
});
