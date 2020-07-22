package ca.cpp

class OwnerRequest(val org: String? = null) {
    private val isOrg = org != null
    override fun toString(): String {
        return "OwnerRequest(org=$org, isOrg=$isOrg)"
    }
}
