/**
 * Created by memkvia on 14.12.2016.
 */
public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                count++;
            }
        }

        Room[] res = new Room[count];

        int index = 0;
        for (Room r : getRooms()) {
            if (r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName()==hotel){
                res[index] = r;
            }
        }
        return res;
    }
}
