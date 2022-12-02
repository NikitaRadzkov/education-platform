# Console chat

## Short Description

Console client-server chat, which allows exchanging messages between multiple users connected to single server.

## Estimation (h)

16

## Topics

* Collection Framework
* Exception Handling
* Java IO, NIO and NIO.2
* Multi-threading and Synchronization

## Requirements

1. The application must be thread safe.
2. Implement simple login after connecting to the server.
3. The server must store information about Users with ADMIN role.
4. Users should be able to get a list of all connected users.
5. Implement the ability to check the status (online / banned / offline, etc.) of one User by his username.
6. Implement the ability to send private messages to one recipient.
7. Admins should be able to create Chat Rooms. Users should be able to get list of all existing rooms / join / switch /
   leave / invite other Users to the room.
8. Admins should be able to ban users.
9. Create custom exceptions for all cases.
10. Implement logging of all events on the server side.
