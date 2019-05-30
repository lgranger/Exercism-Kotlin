package Hamming

    public fun compute(strandA: String, strandB: String): Number {
        require(strandA.length === strandB.length) { "left and right strands must be of equal length." }
        val zipList = strandA.zip(strandB) { a, b -> diff(a, b)}
        return zipList.count { a -> a.equals("") }
    }

    private fun diff(charA: Char, charB: Char): String {
        if (charA.equals(charB)) { return "charA" }
        return ""
    }
