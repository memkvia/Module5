/**
 * Created by memkvia on 14.12.2016.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getRooms();
}