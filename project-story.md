## Inspiration

I was inspired by building something that did not exist in traditional *DeFi* while learning [Solidity](https://docs.soliditylang.org/) as well as [Hedera's Java SDK](https://github.com/hashgraph/hedera-sdk-java).
[CLOBs](https://en.wikipedia.org/wiki/Central_limit_order_book) can be quite complex and many rules can be coded in the smart contract, but showing the basics was my first goal.

## What it does

DLOBex is an implementation of a [CLOBs](https://en.wikipedia.org/wiki/Central_limit_order_book) with the ability to:

- Start/Stop trading by an operator
- Whitelist participants
- Each participant can add market and limit orders
- Some of those orders can result in trades where the smart contract performs a swap on-the-behalf of
- Each DLOBex can be instantiated with any ERC20 token address

## How I built it

- The Solidity code was built with Visual Studio Code IDE and [Hardhat](https://hardhat.org/)
- The Java code was built with OpenJDK 17 and IntelliJ IDE using Hedera's Java SDK
- The HSM used was [Cysec's](https://api.docs.cysec.com/)

## Challenges I ran into

I faced a fairly steep learning curve working with Solidity - and the code shows! Lots of optimisations are still required.  
The second challenge was the decoding of native solidity payloads using Web3J (another [Web3J](https://docs.web3j.io/) learning curve).  
Finally, the interaction with the chain, using Java was challenging but several examples provided in [GitHub](https://github.com/hashgraph/hedera-sdk-java).  proved to be very helpful.

## Accomplishments that I am proud of

- Learning Solidity
- Learning Hedera's SDK
- Ability to use a Hardware Security Module to generate addresses and sign payloads

## What I learned

I enjoy learning about Hedera, Solidity and Web3J as well as the integration with a Hardware Security Module for the key generation and payload signing.

## What's next for DLOBex

I will be adding when time permits more business rules to orders such as fees handling, penalty for misbehavior, time-based orders,
price difference enforcement to increase liquidity, writing the trading rule book, and so on.

## Note on prior work

Since I became aware of Hedera (years ago) - I also thought about CLOBs on Hedera.
My first implementation was done with the Swirlds SDK (https://www.swirlds.com/) running locally a couple of years ago.
I have also in my pastime before H22 looked a how CLOBs would work in Solidity and Solana Rust and how to interact with the Test Network using Java.

