// Function to convert currency
function convertCurrency() {
    const amount = document.getElementById('amount').value;
    const fromCurrency = document.getElementById('fromCurrency').value;
    const toCurrency = document.getElementById('toCurrency').value;

    const exchangeRates = {
        'USD': 1.0,
        'EUR': 0.89,
        'GBP': 0.77,
        'JPY': 110.17,
        'AUD': 1.39,
        'CAD': 1.27,
        'CHF': 1.08,
        'CNY': 6.48,
        'INR': 74.66,
        'BRL': 5.36
    };

    const fromRate = exchangeRates[fromCurrency];
    const toRate = exchangeRates[toCurrency];

    const result = (amount / fromRate) * toRate;
    document.getElementById('result').innerText = `${amount} ${fromCurrency} = ${result.toFixed(2)} ${toCurrency}`;
}
