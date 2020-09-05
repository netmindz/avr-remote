/*
 * Copyright the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.pskiwi.avrremote.log;

public interface ILogger
{
	void debug(String s);

	void info(String s);

	void error(String s, Throwable x);

	void close();

	public final static ILogger NULL_LOGGER = new ILogger()
	{
		public void debug(String s)
		{
		}

		public void error(String s, Throwable x)
		{
		}

		public void info(String s)
		{
		}

		public void close()
		{
		};

	};
}