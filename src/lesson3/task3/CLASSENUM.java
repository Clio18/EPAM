package lesson3.task3;


public abstract class CLASSENUM<E extends CLASSENUM<E>> {
    protected int id;
    protected String name;

    protected CLASSENUM(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof CLASSENUM)) return false;
        final CLASSENUM classenum = (CLASSENUM) o;
        return (id == classenum.id);
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return getClass().getName() + "[id=" + id
                + ", name=" + name + "]";
    }

    protected static CLASSENUM getByName(CLASSENUM[] classenums, String name) {
        if (name != null) {
            for (int i = 0; i < classenums.length; i++) {
                if (classenums[i].name.equalsIgnoreCase(name)) {
                    return classenums[i];
                }
            }
        }
        return null;
    }

    protected static CLASSENUM getById(CLASSENUM[] classenums, int id) {
        for (int i = 0; i < classenums.length; i++) {
            if (classenums[i].id == id) {
                return classenums[i];
            }
        }
        return null;
    }

}
