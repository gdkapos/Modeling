public abstract class VersionedElement extends Element {
    private List<ElementVersion> versions;
    
    public List<ElementVersion> getVersions() {
    return this.versions;
    }
}
