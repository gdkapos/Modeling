public class PropertySpecification extends NamedVersionedElement {
    private Type ownerType;
    private Type propertyType;
    private Multiplicity multiplicity;
    
    public Type getOwnerType() {
        return this.ownerType;
    }
    
    public Type getPropertyType() {
        return this.propertyType;
    }
    
    public Multiplicity getMultiplicity() {
        return this.multiplicity;
    }
}
