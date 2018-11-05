public abstract class NamedVersionedElementFacade {
    public NamedVersionedElement create(NamedVersionedElement nve) throws Exception {
        if (nve == null) {
            throw new Exception("No NamedVersionedElement specified for creation!");
        }
        if (nve.getId() != null) {
            throw new Exception("The specified NamedVersionedElement already exists and cannot be created!");
        }
        // Create entity with version 1
        return nve;
    }
    
    public NamedVersionedElement edit(NamedVersionedElement nve) throws Exception {
        if (nve == null) {
            throw new Exception("No NamedVersionedElement specified for edit!");
        }
        if (nve.getId() == null) {
            throw new Exception("The specified NamedVersionedElement does not have an ID and cannot be edited!");
        }
        // Check whether there is a newer version of the element
        // Edit end time of current version
        // Create entity with new version
        return nve;
    }
}
