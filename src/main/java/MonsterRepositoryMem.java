import java.util.HashMap;

public class MonsterRepositoryMem implements MonsterRepository {
    HashMap<String, Monster> monsterHashMap = new HashMap<String, Monster>();

    public void addMonster(Monster monster) {
        monsterHashMap.put(monster.getId(),monster);
    }

    public void getMonster(String id) {
        monsterHashMap.get(id);
    }
}
