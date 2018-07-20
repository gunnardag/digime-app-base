package is.reon.datahack2018.objects;

/**
 * This interface is to implement the fields in  which the models sort themselves by.
 */
public interface DigiObjectInterface {
    long getSortableDate();
    String getSortableName();
    int getListIconDrawable();
    String getListTitle();
    String getListSubtitle();
}
