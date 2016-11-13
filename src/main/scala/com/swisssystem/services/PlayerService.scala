package com.swisssystem.services

import javax.inject.Inject

import com.swisssystem.persistence.PlayerRepository

class PlayerService @Inject() (
  playerRepository: PlayerRepository
) {
}
