package Concrete;

import Abstract.BasePlayerManager;
import Entities.Player;
import Abstract.IPlayerCheckService;

public class MarioPlayerManager extends BasePlayerManager {
    private IPlayerCheckService _playerCheckService;

    public MarioPlayerManager(IPlayerCheckService playerCheckService) {
        _playerCheckService = playerCheckService;
    }

    @Override
    public void Save(Player player) throws Exception {
        if (_playerCheckService != null && _playerCheckService.CheckIfRealPerson(player)) {
            super.Save(player);
        } else {
             throw new Exception("");
        }
    }
}