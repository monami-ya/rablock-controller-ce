/**
 * This file is part of Rablock Community Edition.
 *
 * Rablock Community Edition is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public License 
 * as published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * Rablock Community Edition is distributed in the hope that it will 
 * be useful, but WITHOUT ANY WARRANTY; without even the implied 
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Rablock Community Edition.
 * If not, see <https://www.gnu.org/licenses/>.
 */


package jp.techarts.bc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot実行クラス<br>
 * Copyright (c) 2018 Rablock Inc.
 *
 * @author TA
 * @version 1.0
 */
@SpringBootApplication
public class BCApplication {

  public static void main(String[] args) {
    SpringApplication.run(BCApplication.class, args);
  }
}
