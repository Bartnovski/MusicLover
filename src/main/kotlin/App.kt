fun main() {
    val purchaseAmount = 11000_00U
    val isMusicLover = true
    var discountPrice = purchaseAmount.toDouble()

    if((purchaseAmount > 1000_00U) && (purchaseAmount <= 10000_00U)) {
        discountPrice = purchaseAmount.toDouble() - 100_00.0
    }
    if(purchaseAmount > 10000_00U) {
        discountPrice = (purchaseAmount.toDouble() * 0.95)
    }
    if(isMusicLover) {
        discountPrice *= 0.99
    }

    println("Конечная цена: ${(discountPrice / 100).toUInt()}руб ${if((discountPrice % 100).toUInt() != 0U) (discountPrice % 100).toUInt() else "00"}коп")
}