let tableRow = ""

// make http request to fetch cart items
async function getCartItems() {
    const url = '/api/cart';
    const res = await fetch(url, {
        method:'GET',
    });
    const cart = JSON.parse(await res.text());
    
    for(let i = 0;i < cart.length;i++) {
        console.log(JSON.stringify(cart[i]));
    }
}

getCartItems();