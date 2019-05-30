package Hamming

    public fun compute(strandA: String, strandB: String): Number {
        require(strandA.length === strandB.length) { "left and right strands must be of equal length." }
        return strandA.zip(strandB).count { it.first != it.second }
    }
